import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tic extends JFrame{
	JButton[] jb=new JButton[9];
    static int clicknum=0;
    int[] jx=new int[9];
    int[] jo=new int[9];//jx,jo用来储存X，O的分布
    final static int[][] WIN_STATUS={
    	{0,1,2},{0,3,6},{0,4,8},
		{1,4,7},{2,4,6},{2,5,8},
		{3,4,5},{6,7,8}
    };
    public Tic(){
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setSize(400,400);
    	setLayout(new GridLayout(3,3));
    	setTitle("井字棋");
    	for (int i=0;i<9;i++ ) {
    		jb[i]=new JButton(" ");
    		jb[i].addActionListener(new JBClick());
    		add(jb[i]);
    	}
    	setVisible(true);
    }
    public class JBClick implements ActionListener{
    	public void actionPerformed(ActionEvent e){
    		for (int i=0;i<9;i++ ) {
    			if(e.getSource()==jb[i]){
    				if(clicknum%2==0){
    					jb[i].setText("X");
    					jx[i]=1;
    				}else{
    					jb[i].setText("O");
    					jo[i]=1;
    				}
    				clicknum++;
    				jb[i].setEnabled(false);
    			}
    			
    		}
    		//判断XO胜负
    		if(isWIN(jx)){
    			JOptionPane.showMessageDialog(null,"X方获胜","提示",JOptionPane.DEFAULT_OPTION);
                System.exit(0);
    		}
    		if(isWIN(jo)){
    			JOptionPane.showMessageDialog(null,"O方获胜","提示",JOptionPane.DEFAULT_OPTION);
                System.exit(0);
    		}
    		else{
    			String empty=" ";
    			int emptyNum=9;     //通过空Button的数量判断是否下满
    			for(int i=0;i<9;i++){
    				if(jb[i].getText()!=empty){emptyNum--;}
    			}
    			if(emptyNum==0){
    				JOptionPane.showMessageDialog(null,"平局","提示",JOptionPane.DEFAULT_OPTION);
                    System.exit(0);
    			}
    		}
    	}
    }
    public boolean isWIN(int[] jxo){
    	int result=0;
    	for (int[] chess:WIN_STATUS) {
    		
    		for (int i=0;i<3;i++) {
    			if(jxo[chess[i]]==1){
    				result++;
    			}
    		}
    	 	if(result==3){
                break;
            }else{
                result=0;
                continue;
            }   		
    	}
        if(result==3){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
    	new Tic();
    }
}