
package guiprogramming;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Farid.Faisal
 */
public class GUIProgramming extends JFrame{
//    Buttons of calculator
    private JButton one,two,three,
                    four,five,six,
                    seven,eight,nine,
                    zero,equal,plus,
                    minus,div,mult,
                    sin,cos,tan,
                    mod,reset,del;

//    Containers of buttons and text field
    private JTextField txt;
    private JPanel nums;
    private JPanel ops;
    private JPanel buttons;

    Font font = new Font("Verdana",Font.BOLD,20);

//    arithmatic operations variables
      private double buffer1=0;
      private double buffer2=0;
      private char operator=0;

   GUIProgramming(){

       setLayout(new BorderLayout());
       one=new JButton("1");   two=new JButton("2");
       three=new JButton("3"); four=new JButton("4");
       five=new JButton("5");  six=new JButton("6");
       seven=new JButton("7"); eight=new JButton("8");
       nine=new JButton("9");  zero=new JButton("0");
       equal=new JButton("=");   plus=new JButton("+");
       minus=new JButton("-"); div=new JButton("/");
       mult=new JButton("*");  sin=new JButton("sin");
       cos=new JButton("cos"); tan=new JButton("tan");
       mod=new JButton("%");   reset=new JButton("Reset");
       del=new JButton("Del <--");

       one.setFont(font);
       two.setFont(font);
       three.setFont(font);
       four.setFont(font);
       five.setFont(font);
       six.setFont(font);
       seven.setFont(font);
       eight.setFont(font);
       nine.setFont(font);
       zero.setFont(font);
       equal.setFont(font);
       plus.setFont(font);
       minus.setFont(font);
       div.setFont(font);
       mult.setFont(font);
       sin.setFont(font);
       cos.setFont(font);
       tan.setFont(font);
       mod.setFont(font);
       reset.setFont(font);
       del.setFont(font);
       
       one.setBackground(Color.white);one.setForeground(Color.blue);
       two.setBackground(Color.white);two.setForeground(Color.blue);
       three.setBackground(Color.white);three.setForeground(Color.blue);
       four.setBackground(Color.white);four.setForeground(Color.blue);
       five.setBackground(Color.white);five.setForeground(Color.blue);
       six.setBackground(Color.white);six.setForeground(Color.blue);
       seven.setBackground(Color.white);seven.setForeground(Color.blue);
       eight.setBackground(Color.white);eight.setForeground(Color.blue);
       nine.setBackground(Color.white);nine.setForeground(Color.blue);
       zero.setBackground(Color.white);zero.setForeground(Color.blue);
       plus.setBackground(Color.white);plus.setForeground(Color.blue);
       minus.setBackground(Color.white);minus.setForeground(Color.blue);
       div.setBackground(Color.white);div.setForeground(Color.blue);
       mult.setBackground(Color.white);mult.setForeground(Color.blue);
       mod.setBackground(Color.white);mod.setForeground(Color.blue);
       equal.setBackground(Color.white);equal.setForeground(Color.blue);
       sin.setBackground(Color.white);sin.setForeground(Color.blue);
       cos.setBackground(Color.white);cos.setForeground(Color.blue);
       tan.setBackground(Color.white);tan.setForeground(Color.blue);
       reset.setBackground(Color.white);reset.setForeground(Color.blue);
       del.setBackground(Color.white);del.setForeground(Color.blue);
       
       nums=new JPanel();
       ops=new JPanel();
       buttons=new JPanel();
       txt=new JTextField(30);
       
       nums.setLayout(new GridLayout(4,3,10,10));
       ops.setLayout(new GridLayout(4,3,10,10));
       buttons.setLayout(new GridLayout(2,1,20,20));
       
       nums.add(one);   nums.add(two);
       nums.add(three); nums.add(four);
       nums.add(five);  nums.add(six);
       nums.add(seven); nums.add(eight);
       nums.add(nine);  nums.add(zero);
       
       ops.add(equal);ops.add(plus);
       ops.add(minus);ops.add(mult);
       ops.add(div);ops.add(mod);
       ops.add(sin);ops.add(cos);
       ops.add(tan);ops.add(reset);
       ops.add(del);
       
       add(txt,BorderLayout.NORTH);
       buttons.add(nums);
       buttons.add(ops);
       add(buttons,BorderLayout.SOUTH);

       ActionListener action=new Action();
       one.addActionListener(action);
       two.addActionListener(action);
       three.addActionListener(action);
       four.addActionListener(action);
       five.addActionListener(action);
       six.addActionListener(action);
       seven.addActionListener(action);
       eight.addActionListener(action);
       nine.addActionListener(action);
       zero.addActionListener(action);
       equal.addActionListener(action);
       plus.addActionListener(action);
       minus.addActionListener(action);
       div.addActionListener(action);
       mult.addActionListener(action);
       sin.addActionListener(action);
       cos.addActionListener(action);
       tan.addActionListener(action);
       mod.addActionListener(action);
       reset.addActionListener(action);
       del.addActionListener(action);


       setTitle("Calculator Application");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
       setVisible(true);
       setSize(550,450);
       setAlwaysOnTop(true);
   }
    private class Action implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==one){
                txt.setText(txt.getText()+one.getText());
            }
            else if(e.getSource()==two){
                txt.setText(txt.getText()+two.getText());
            }
            else if(e.getSource()==three){
                txt.setText(txt.getText()+three.getText());
            }
            else if(e.getSource()==four){
                txt.setText(txt.getText()+four.getText());
            }
            else if(e.getSource()==five){
                txt.setText(txt.getText()+five.getText());
            }
            else if(e.getSource()==six){
                txt.setText(txt.getText()+six.getText());
            }
            else if(e.getSource()==six){
                txt.setText(txt.getText()+six.getText());
            }
            else if(e.getSource()==seven){
                txt.setText(txt.getText()+seven.getText());
            }
            else if(e.getSource()==eight){
                txt.setText(txt.getText()+eight.getText());
            }
            else if(e.getSource()==nine){
                txt.setText(txt.getText()+nine.getText());
            }
            else if(e.getSource()==zero){
                txt.setText(txt.getText()+zero.getText());
            }
            else if(e.getSource()==plus){
                operator=1;
                buffer1=Integer.parseInt(txt.getText());
                txt.setText("");
            }
            else if(e.getSource()==minus){
                operator=2;
                buffer1=Integer.parseInt(txt.getText());
                txt.setText("");
            }
            else if(e.getSource()==div){
                operator=3;
                buffer1=Integer.parseInt(txt.getText());
                txt.setText("");
            }
            else if(e.getSource()==mult){
                operator=4;
                buffer1=Integer.parseInt(txt.getText());
                txt.setText("");
            }
            else if(e.getSource()==mod){
                operator=5;

                buffer1=Integer.parseInt(txt.getText());
                txt.setText("");
            }
            else if(e.getSource()==reset){
                txt.setText("");
                buffer1=0;
                buffer2=0;
                operator=0;
            }
            else if(e.getSource()==del){
                String text=txt.getText();
                txt.setText("");
                for(int i=0;i<text.length()-1;i++){
                    txt.setText(txt.getText()+text.charAt(i));
                }
            }
            else if(e.getSource()==sin){
                double value = Double.parseDouble(txt.getText());
                double rad=Math.toRadians(value);
                value=Math.sin(rad);
                value+=.00000002;
                txt.setText(""+(float)value);
                operator=0;
                buffer1=0;buffer2=0;
            }else if(e.getSource()==cos){
                double value = Double.parseDouble(txt.getText());
                double rad=Math.toRadians(value);
                value=Math.cos(rad);
                value+=.00000002;
                txt.setText(""+(float)value);
                operator=0;
                buffer1=0;buffer2=0;
            }else if(e.getSource()==tan){
                double value = Double.parseDouble(txt.getText());
                double rad=Math.toRadians(value);
                value=Math.tan(rad);
                value+=.00000002;
                txt.setText(""+(float)value);
                operator=0;
                buffer1=0;buffer2=0;
            }
            else if(e.getSource()==equal){
                buffer2=Double.parseDouble(txt.getText());
                switch(operator){
                    case 1:
                        txt.setText(String.valueOf(buffer1+buffer2));
                        operator=0;
                        break;
                    case 2:
                        txt.setText(String.valueOf(buffer1-buffer2));
                        operator=0;
                        break;
                    case 3:
                        txt.setText(String.valueOf(buffer1/buffer2));
                        operator=0;
                        break;
                    case 4:
                        txt.setText(String.valueOf(buffer1*buffer2));
                        operator=0;
                        break;
                    case 5:
                        txt.setText(String.valueOf(buffer1%buffer2));
                        operator=0;
                        break;
                    default:
                        txt.setText("error");
                        operator=0;
                        buffer1=buffer2=0;
                }
            }
        }
    }
    public static void main(String[] args) {
       new GUIProgramming();
    }

}
