package Game;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.*;

@SuppressWarnings("serial")
public class JavaBasics extends Applet implements MouseListener,MouseMotionListener,ActionListener
{
    private static final int centerX=500,centerY=250;
	int x,y,a,b,sizeb=20,n=100,i,j,bcho=3,p=0;
	int vx=centerX-(sizeb*(n/2));
	int vy=centerY-(sizeb*(10/4));
	
	Button click1,click2,click3,start;
	int widOut=sizeb*n,heiOut=sizeb*8;
	private Image image;
	private Graphics doubleb;
	tileinfo[][] tilearray;
	
	int[] colorArray,colArray,rowArray;
	
	int cF=0,cF1,cF2,cF3,cF4,cF5,cF6,cF7,cF8;
	int rF=0,rF1,rF2,rF3,rF4,rF5,rF6,rF7,rF8;
	int cG=0,cG1,cG2,cG3,cG4,cG5,cG6,cG7,cG8;
	int rG=0,rG1,rG2,rG3,rG4,rG5,rG6,rG7,rG8;
	int cH=0,cH1,cH2,cH3,cH4,cH5,cH6,cH7,cH8;
	int rH=0,rH1,rH2,rH3,rH4,rH5,rH6,rH7,rH8;
	
	@Override
	public void init() 
	{
		setSize(1000,500);
		addMouseListener(this);
		addMouseMotionListener(this);
		click1=new Button("block");
		click2=new Button("end-pos");
		click3=new Button("init-pos");
		start=new Button("start");
		click1.addActionListener(this);
		click2.addActionListener(this);
		click3.addActionListener(this);
		start.addActionListener(this);
		add(click1);
		add(click2);
		add(click3);
		add(start);
		tilearray=new tileinfo[1000][80];
		colorArray=new int[1000*80];
		colArray=new int[100];
		rowArray=new int[80];
		for(int ii=0;ii<tilearray.length;ii++)
		{
			for(int jj=0;jj<tilearray[jj].length;jj++)
			{
				tilearray[ii][jj]=new tileinfo(ii,jj);
			}
		}
		vx=0;
		vy=0;
		
		updateMe();
		
	}
	
	@Override
	public void paint(Graphics g) 
	{
		//g.drawString("mouse is at  "+a+","+b,x, y);
		g.setColor(Color.LIGHT_GRAY);
		for(int ii=0;ii<n;ii++)
		{
			for(int jj=0;jj<tilearray[jj].length;jj++)
			{
			    g.drawRect(sizeb*tilearray[ii][jj].getI()+vx, sizeb*tilearray[ii][jj].getJ()+vy,sizeb, sizeb);
			    if(tilearray[ii][jj].getType()==3)
			    {
			    	g.setColor(Color.gray);
			    	g.fillRect(sizeb*tilearray[ii][jj].getI()+vx, sizeb*tilearray[ii][jj].getJ()+vy,sizeb, sizeb);
			    	g.setColor(Color.LIGHT_GRAY);
			    }
			    if(tilearray[ii][jj].getType()==5)
			    {
			    	g.setColor(Color.green);
			    	g.fillRect(sizeb*tilearray[ii][jj].getI()+vx, sizeb*tilearray[ii][jj].getJ()+vy,sizeb, sizeb);
			    	g.setColor(Color.LIGHT_GRAY);
			    }

			    if(tilearray[ii][jj].getType()==7)
			    {
			    	g.setColor(Color.RED);
			    	g.fillRect(sizeb*tilearray[ii][jj].getI()+vx, sizeb*tilearray[ii][jj].getJ()+vy,sizeb, sizeb);
			    	g.setColor(Color.LIGHT_GRAY);
			    }	
			    
			    if(tilearray[ii][jj].getType()==9)
			    {
			    	g.setColor(Color.cyan);
			    	g.fillRect(sizeb*tilearray[ii][jj].getI()+vx, sizeb*tilearray[ii][jj].getJ()+vy,sizeb, sizeb);
			    	g.setColor(Color.LIGHT_GRAY);
			    }
			}
		}
		g.setColor(Color.lightGray);
		g.fillRect(vx+a,vy+b, sizeb, sizeb);
		g.setColor(Color.GRAY);
		//g.drawRect(vx, vy, widOut, heiOut);
	    g.drawString("i="+i+" j="+j,vx-5,vy);
	}
	
	@Override
	public void mouseClicked(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();
		if(x<((sizeb*n)+vx) && x>vx)
		{
		  a=(x-vx)-((x-vx)%sizeb);
		  
		}
		if(y<((sizeb*80)+vy) && y>vy)
		{
			 b=(y-vy)-((y-vy)%sizeb);
			
		}
		i=a/sizeb;
		j=b/sizeb;
		tilearray[i][j].setType(bcho);
		
		colArray[p]=i;
		rowArray[p]=j;
		colorArray[p]=bcho;
		p++;
		
		System.out.println(i+" "+j+" type="+tilearray[i][j].getType());
	}
	@Override
	public void mouseEntered(MouseEvent e) 
	{
		 
		
	}
	@Override
	public void mouseExited(MouseEvent e)
	{
		
		
	}
	@Override
	public void mousePressed(MouseEvent e)
	{
		
		
	}
	@Override
	public void mouseReleased(MouseEvent e)
	{
		
	}
	@Override
	public void mouseDragged(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();
		if(x<((sizeb*n)+vx) && x>vx)
		{
		  a=(x-vx)-((x-vx)%sizeb);
		  
		}
		if(y<((sizeb*80)+vy) && y>vy)
		{
			 b=(y-vy)-((y-vy)%sizeb);
			
		}
		i=a/sizeb;
		j=b/sizeb;
		tilearray[i][j].setType(bcho);
		
		
		
	}
	@Override
	public void mouseMoved(MouseEvent e) 
	{
		x=e.getX();
		y=e.getY();
		if(x<((sizeb*n)+vx) && x>vx)
		{
		  a=(x-vx)-((x-vx)%sizeb);
		  
		}
		if(y<((sizeb*80)+vy) && y>vy)
		{
			 b=(y-vy)-((y-vy)%sizeb);
			
		}
		updateMe();
		repaint();
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==click1)
		{
			bcho=3;
		 
		}
		else if(e.getSource()==click2)
		{
			bcho=5;
		}
		else if(e.getSource()==click3)
		{
			bcho=7;
		}
		if(e.getSource() == start)
		{
			for(int h=0;h<colorArray.length;h++)
			{
				if(colorArray[h]==5)
				{
					for(int i=0;i<colorArray.length;i++)
					{
						if(colorArray[i]==7)
						{
							// A* Algorithm formula
							cH=Math.abs(colArray[h]-colArray[i]);
							rH=Math.abs(rowArray[h]-rowArray[i]);
							cG=Math.abs(colArray[i]);
							rG=Math.abs(rowArray[i]);
							cF=Math.abs(cH-cG);
							rF=Math.abs(rH-rG);
							
						}
					}
				}
				
				if(colorArray[h] == 7)
				{
					if(tilearray[colArray[h] + 1][rowArray[h] - 1].getType() != 3)
					{
						bcho=9;
						tilearray[colArray[h] + 1][rowArray[h] - 1].setType(bcho);
						tilearray[colArray[h] + 1][rowArray[h] - 1].setCost(14);
					}
					if(tilearray[colArray[h] + 1][rowArray[h]].getType() != 3)
					{
						bcho=9;
						tilearray[colArray[h] + 1][rowArray[h]].setType(bcho);
						tilearray[colArray[h] + 1][rowArray[h]].setCost(10);
					}
					if(tilearray[colArray[h] + 1][rowArray[h] + 1].getType() != 3)
					{
						bcho=9;
						tilearray[colArray[h] + 1][rowArray[h] + 1].setType(bcho);
						tilearray[colArray[h] + 1][rowArray[h] + 1].setCost(14);
					}
					if(tilearray[colArray[h]][rowArray[h] + 1].getType() != 3)
					{
						bcho=9;
						tilearray[colArray[h]][rowArray[h] + 1].setType(bcho);
						tilearray[colArray[h]][rowArray[h] + 1].setCost(10);
					}
					if(tilearray[colArray[h] - 1][rowArray[h] + 1].getType() != 3)
					{
						bcho=9;
						tilearray[colArray[h] - 1][rowArray[h] + 1].setType(bcho);
						tilearray[colArray[h] - 1][rowArray[h] + 1].setCost(14);
					}
					if(tilearray[colArray[h] - 1][rowArray[h]].getType() != 3)
					{
						bcho=9;
						tilearray[colArray[h] - 1][rowArray[h]].setType(bcho);
						tilearray[colArray[h] - 1][rowArray[h]].setCost(10);
					}
					if(tilearray[colArray[h] - 1][rowArray[h] - 1].getType() != 3)
					{
						bcho=9;
						tilearray[colArray[h] - 1][rowArray[h] - 1].setType(bcho);
						tilearray[colArray[h] - 1][rowArray[h] - 1].setCost(14);
					}
					if(tilearray[colArray[h]][rowArray[h] - 1].getType() != 3)
					{
						bcho=9;
						tilearray[colArray[h]][rowArray[h] - 1].setType(bcho);
						tilearray[colArray[h]][rowArray[h] - 1].setCost(10);
					}
				}
			}
		}
		repaint();
	
		
	}
	public void updateMe()
	{
		 widOut=sizeb*n;
		 heiOut=sizeb*(n/2);
		// vx=centerX-(sizeb*(n/2));
	  	 //vy=centerY-(sizeb*(n/4));
		 widOut=sizeb*n;
		 heiOut=sizeb*5;
		 i=a/(sizeb);
		 j=b/(sizeb);
		
		
	}
	 
	
	  @Override
	  public void update(Graphics g)
	  {
		 if(image==null)
		 {
			 image=createImage(this.getSize().width,this.getSize().height);
			 doubleb=image.getGraphics();
		 }
		 doubleb.setColor(getBackground());
		 doubleb.fillRect(0, 0, this.getSize().width, this.getSize().height);
		 doubleb.setColor(getForeground());
		 paint(doubleb);
		 
		 g.drawImage(image, 0, 0, this);
		 
	  }

	
}