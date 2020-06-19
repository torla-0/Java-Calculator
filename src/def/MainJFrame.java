
package def;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class MainJFrame extends JFrame{
    //                  operation variable
    String firstInput = "";
    String secondInput = "";
    boolean switchInput = false;
    
    JLabel bigLabel;
    JPanel labelPanel;
    
    JLabel smallLabel;
    JPanel intputLabelPane;
    //                  GUI variable
    JPanel buttonPanel;
    JButton one;
    JButton two;
    JButton three;
    JButton four;
    JButton five;
    JButton six;
    JButton seven;
    JButton eight;
    JButton nine;
    JButton zero;
    
    JButton negateBtn;
    JButton pointBtn;
    JButton plus;
    JButton minus;
    JButton multiple;
    JButton divide;
    JButton clearBtn;
    JButton equalBtn;
    JButton backSpaceBtn;
    JButton clearLastBtn;
    JButton procentBtn;
    JButton rootBtn;
    JButton squareBtn;
    JButton divideWithOneBtn;
    
    JPanel paneOne;
    JPanel paneTwo;
    JPanel paneThree;
    JPanel paneFour;
    JPanel paneFive;
    JPanel paneBeforeOne;
    
    FlowLayout flowLayout;
    BoxLayout boxLayout; 
    
    Font fontNumber;
    Font fontSingh;
    Dimension sizeBtn;
    Color notWhite;
    Color numberColor;
    String inputLabelString;

    //                          output variable
    ArrayList<String> numberList; 
    Integer resultInteger;
    Double resultDouble;
    NumberFormat numberFormat;
                                //event
    MouseListener btnListener;
    MouseListener numberListener;

    //              constructor
    MainJFrame()
    {
//______________________________________________________________________________ Button event
        btnListener = new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                e.getComponent().setBackground(Color.LIGHT_GRAY);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                e.getComponent().setBackground(notWhite);
            }
        };   
        numberListener = new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                e.getComponent().setBackground(Color.LIGHT_GRAY);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                e.getComponent().setBackground(numberColor);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                Object o = e.getSource();
                JButton b = null;
                String buttonText = "";

                if(o instanceof JButton)
                  b = (JButton)o;

                if(b != null)
                  buttonText = b.getText();
                
                if(switchInput)
                {
                    secondInput += buttonText;
                    bigLabel.setText(numberFormat.format(Double.valueOf(secondInput)));
                    
                }else{
                    firstInput += buttonText;
                    bigLabel.setText(numberFormat.format(Double.valueOf(firstInput)));
                }
            }
        };
                                         // GUI   
        flowLayout = new FlowLayout();
        boxLayout = new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS);
        
        fontNumber = new Font("Dialog", Font.BOLD, 24);
        fontSingh = new Font("Dialog", Font.PLAIN, 24);
        sizeBtn = new Dimension(125, 70);
        
        notWhite = new Color(230,230,230);
        numberColor = new Color(245, 245, 245);

        numberFormat = NumberFormat.getInstance(Locale.UK);

        labelPanel = new JPanel();
        bigLabel = new JLabel("0");
        bigLabel.setFont(new Font("Dialog", Font.BOLD, 48));
        bigLabel.setPreferredSize(new Dimension(480, 100));
        bigLabel.setOpaque(true);
        bigLabel.setHorizontalAlignment(SwingConstants.RIGHT);

        intputLabelPane = new JPanel();
        smallLabel = new JLabel();
        smallLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
        smallLabel.setPreferredSize(new Dimension(480, 70));
        smallLabel.setHorizontalAlignment(SwingConstants.RIGHT);

        numberList = new ArrayList<String>();
        inputLabelString = new String("");
        //______________________________Buttons Numbers
        buttonPanel = new JPanel();
        one = new JButton("1");
        one.setFont(fontNumber);
        one.setPreferredSize(sizeBtn);
        one.setOpaque(true);
        one.setBackground(numberColor);
        one.addMouseListener(numberListener);
        
        two = new JButton("2");
        two.setFont(fontNumber);
        two.setPreferredSize(sizeBtn);
        two.setOpaque(true);
        two.setBackground(numberColor);
        two.addMouseListener(numberListener);
        
        three = new JButton("3");
        three.setFont(fontNumber);
        three.setPreferredSize(sizeBtn);
        three.setOpaque(true);
        three.setBackground(numberColor);
        three.addMouseListener(numberListener);
        
        four = new JButton("4");
        four.setFont(fontNumber);
        four.setPreferredSize(sizeBtn);
        four.setOpaque(true);
        four.setBackground(numberColor);
        four.addMouseListener(numberListener);
        
        five = new JButton("5");
        five.setFont(fontNumber);
        five.setPreferredSize(sizeBtn);
        five.setOpaque(true);
        five.setBackground(numberColor);
        five.addMouseListener(numberListener);
        
        six = new JButton("6");
        six.setFont(fontNumber);
        six.setPreferredSize(sizeBtn);
        six.setOpaque(true);
        six.setBackground(numberColor);
        six.addMouseListener(numberListener);
        
        seven = new JButton("7");
        seven.setFont(fontNumber); 
        seven.setPreferredSize(sizeBtn);
        seven.setOpaque(true);
        seven.setBackground(numberColor);
        seven.addMouseListener(numberListener);
        
        eight = new JButton("8");
        eight.setFont(fontNumber);
        eight.setPreferredSize(sizeBtn);
        eight.setOpaque(true);
        eight.setBackground(numberColor);
        eight.addMouseListener(numberListener);
        
        nine = new JButton("9");
        nine.setFont(fontNumber);
        nine.setPreferredSize(sizeBtn);
        nine.setOpaque(true);
        nine.setBackground(numberColor);
        nine.addMouseListener(numberListener);
        
        zero = new JButton("0");
        zero.setFont(fontNumber);
        zero.setPreferredSize(sizeBtn);
        zero.setOpaque(true);
        zero.setBackground(numberColor);
        zero.addMouseListener(numberListener);
        
        //____________________________________Buttons Singhs
        negateBtn = new JButton("-/+");
        negateBtn.setFont(fontSingh);
        negateBtn.setPreferredSize(sizeBtn);
        negateBtn.setOpaque(true);
        negateBtn.setBackground(notWhite);
        negateBtn.addMouseListener(btnListener);
        
        pointBtn = new JButton(".");
        pointBtn.setFont(fontSingh);
        pointBtn.setPreferredSize(sizeBtn);
        pointBtn.setOpaque(true);
        pointBtn.setBackground(notWhite);
        pointBtn.addMouseListener(btnListener);
        
        plus = new JButton("+");
        plus.setFont(fontSingh);
        plus.setPreferredSize(sizeBtn);
        plus.setOpaque(true);
        plus.setBackground(notWhite);
        plus.addMouseListener(btnListener);
        
        minus = new JButton("-");
        minus.setFont(fontSingh);
        minus.setPreferredSize(sizeBtn);
        minus.setOpaque(true);
        minus.setBackground(notWhite);
        minus.addMouseListener(btnListener);
        
        multiple = new JButton("*");
        multiple.setFont(fontSingh);
        multiple.setPreferredSize(sizeBtn);
        multiple.setOpaque(true);
        multiple.setBackground(notWhite);
        multiple.addMouseListener(btnListener);
        
        divide = new JButton("÷");
        divide.setFont(fontSingh);
        divide.setPreferredSize(sizeBtn);
        divide.setOpaque(true);
        divide.setBackground(notWhite);
        divide.addMouseListener(btnListener);
        
        clearBtn = new JButton("C");
        clearBtn.setFont(fontSingh);
        clearBtn.setPreferredSize(sizeBtn);
        clearBtn.setOpaque(true);
        clearBtn.setBackground(notWhite);
        clearBtn.addMouseListener(btnListener);
        
        
        equalBtn = new JButton("=");
        equalBtn.setFont(fontSingh);
        equalBtn.setPreferredSize(sizeBtn);
        equalBtn.setOpaque(true);
        equalBtn.setBackground(notWhite);
        equalBtn.addMouseListener(btnListener);
        
        backSpaceBtn = new JButton("←");
        backSpaceBtn.setFont(fontSingh);
        backSpaceBtn.setPreferredSize(sizeBtn);
        backSpaceBtn.setOpaque(true);
        backSpaceBtn.setBackground(notWhite);
        backSpaceBtn.addMouseListener(btnListener);
        
        clearLastBtn = new JButton("CE");
        clearLastBtn.setFont(fontSingh);
        clearLastBtn.setPreferredSize(sizeBtn);
        clearLastBtn.setOpaque(true);
        clearLastBtn.setBackground(notWhite);
        clearLastBtn.addMouseListener(btnListener);
        
        procentBtn = new JButton("%");
        procentBtn.setFont(fontSingh);
        procentBtn.setPreferredSize(sizeBtn);
        procentBtn.setOpaque(true);
        procentBtn.setBackground(notWhite);
        procentBtn.addMouseListener(btnListener);
         
        rootBtn = new JButton("√");
        rootBtn.setFont(fontSingh);
        rootBtn.setPreferredSize(sizeBtn);
        rootBtn.setOpaque(true);
        rootBtn.setBackground(notWhite);
        rootBtn.addMouseListener(btnListener);
         
        squareBtn = new JButton("x²");      
        squareBtn.setFont(fontSingh);
        squareBtn.setPreferredSize(sizeBtn);
        squareBtn.setOpaque(true);
        squareBtn.setBackground(notWhite);
        squareBtn.addMouseListener(btnListener);
         
        divideWithOneBtn = new JButton("1/x");
        divideWithOneBtn.setFont(fontSingh);
        divideWithOneBtn.setPreferredSize(sizeBtn);
        divideWithOneBtn.setOpaque(true);
        divideWithOneBtn.setBackground(notWhite);
        divideWithOneBtn.addMouseListener(btnListener);
        //_________________________________________Panels
        paneOne = new JPanel();
        paneTwo = new JPanel();
        paneThree = new JPanel();
        paneFour = new JPanel();
        paneFive = new JPanel();
        paneBeforeOne = new JPanel();
        
        intputLabelPane.setLayout(flowLayout);
        intputLabelPane.add(smallLabel);
        
        labelPanel.setLayout(flowLayout);
        labelPanel.add(bigLabel);
        
        paneOne.setLayout(flowLayout);
        paneOne.add(clearLastBtn);
        paneOne.add(clearBtn);
        paneOne.add(backSpaceBtn);
        paneOne.add(divide);
        
        paneTwo.setLayout(flowLayout);
        paneTwo.add(seven);
        paneTwo.add(eight);
        paneTwo.add(nine);
        paneTwo.add(multiple);
        
        paneThree.setLayout(flowLayout);
        paneThree.add(four);
        paneThree.add(five);
        paneThree.add(six);
        paneThree.add(minus);
        
        paneFour.setLayout(flowLayout);
        paneFour.add(one);
        paneFour.add(two);
        paneFour.add(three);
        paneFour.add(plus);
        
        paneFive.setLayout(flowLayout);
        paneFive.add(negateBtn);
        paneFive.add(zero);
        paneFive.add(pointBtn);
        paneFive.add(equalBtn);
        
        paneBeforeOne.setLayout(flowLayout);
        paneBeforeOne.add(procentBtn);
        paneBeforeOne.add(rootBtn);
        paneBeforeOne.add(squareBtn);
        paneBeforeOne.add(divideWithOneBtn);

        flowLayout.setHgap(3);
        flowLayout.setVgap(3);
        
        this.setLayout(boxLayout);
        this.add(intputLabelPane);
        this.add(labelPanel);
        this.add(paneBeforeOne);
        this.add(paneOne);
        this.add(paneTwo);
        this.add(paneThree);
        this.add(paneFour);
        this.add(paneFive);
        
        this.setTitle("Calculator");
        //this.setLocationRelativeTo(null);
        this.setSize(520, 650);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        
        one.setBorder(null);
        two.setBorder(null);
        three.setBorder(null);
        four.setBorder(null);
        five.setBorder(null);
        six.setBorder(null);
        seven.setBorder(null);
        eight.setBorder(null);
        nine.setBorder(null);
        zero.setBorder(null);
        plus.setBorder(null);
        minus.setBorder(null);
        divide.setBorder(null);
        multiple.setBorder(null);
        pointBtn.setBorder(null);
        negateBtn.setBorder(null);
        divideWithOneBtn.setBorder(null);
        squareBtn.setBorder(null);
        rootBtn.setBorder(null);
        procentBtn.setBorder(null);
        clearBtn.setBorder(null);
        clearLastBtn.setBorder(null);
        equalBtn.setBorder(null);
        backSpaceBtn.setBorder(null);

        //______________________________________________________________________Event for operation
        
        pointBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(switchInput == false)
                {
                    if(firstInput.equals(""))
                    {
                        firstInput = "0";
                    }
                    firstInput += ".";
                    bigLabel.setText(firstInput);
                }else{
                    if(secondInput.equals(""))
                    {
                       secondInput = "0"; 
                    }
                    secondInput += ".";
                    bigLabel.setText(secondInput);
                } 
            }
        });
        plus.addActionListener((ActionEvent e) -> {
            
            if(!firstInput.isEmpty())
            {
                if(!switchInput)
                {
                    switchInput = true;
                    numberList.add(firstInput);    
                    inputLabelString += firstInput;
                }else{
                    if (!secondInput.equals(""))
                    {
                        numberList.add(secondInput);
                        inputLabelString += secondInput;
                    } 
                }    
                if(numberList.size() > 2)
                {
                    calculate();   
                }
                inputLabelString = checkLastSignPlus(inputLabelString);            
                smallLabel.setText(inputLabelString);
            }
        });
        minus.addActionListener((ActionEvent e) -> {
            if(!firstInput.isEmpty())
            {
                if(!switchInput)
                {
                    switchInput = true;
                    numberList.add(firstInput);    
                    inputLabelString += firstInput;
                }else{
                    if (!secondInput.equals(""))
                    {
                        numberList.add(secondInput);
                        inputLabelString += secondInput;
                    }
                }
                if(numberList.size() > 2)
                {
                    calculate();
                }
                inputLabelString = checkLastSignMinus(inputLabelString);
                smallLabel.setText(inputLabelString);
            }
        });
        multiple.addActionListener((ActionEvent e) -> {
            if(!firstInput.isEmpty())
            {
                if(!switchInput)
                {
                    switchInput = true;
                    numberList.add(firstInput);    
                    inputLabelString += firstInput;
                }else{
                    if (!secondInput.equals(""))
                    {
                        numberList.add(secondInput);
                        inputLabelString += secondInput;
                    }
                }
                if(numberList.size() > 2)
                {
                    calculate();
                }
                inputLabelString = checkLastSignMultiple(inputLabelString);
                smallLabel.setText(inputLabelString);
            }
        });
        divide.addActionListener((ActionEvent e) -> {
            if(!firstInput.isEmpty())
            {
                if(!switchInput)
                {
                    switchInput = true;
                    numberList.add(firstInput);    
                    inputLabelString += firstInput;
                }else{
                    if (!secondInput.equals(""))
                    {
                        numberList.add(secondInput);
                        inputLabelString += secondInput;
                    }
                }
                if(numberList.size() > 2)
                {
                    calculate();
                }
                inputLabelString = checkLastSignDivide(inputLabelString);
                smallLabel.setText(inputLabelString);
            }
        });
        negateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(switchInput == false)
                {
                    if(!firstInput.equals(""))
                    {
                        if(firstInput.contains("-"))
                        {
                            firstInput = firstInput.replace("-", "");
                            bigLabel.setText(firstInput);
                        }else
                        {
                            firstInput = "-" + firstInput;
                            bigLabel.setText(firstInput);
                        }
                    }
                }else{
                    if(!secondInput.equals(""))
                    {
                        if(secondInput.contains("-"))
                        {
                            secondInput = secondInput.replace("-", "");
                            bigLabel.setText(secondInput);
                        }else
                        {
                            secondInput = "-" + secondInput;
                            bigLabel.setText(secondInput);
                        }
                    }
                } 
            }
        });
        equalBtn.addActionListener((ActionEvent e) -> {
            
            if(switchInput == true)
            {
                switchInput = false;
                numberList.add(secondInput);
                inputLabelString += secondInput;
            }

            if(!numberList.isEmpty())
            {
                smallLabel.setText(inputLabelString + "=");
                bigLabel.setText(numberList.get(numberList.size()-1));
            }

            if(numberList.size() > 2)
            {  
                calculate();
                inputLabelString = "";
            }
        });
        procentBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            if(!firstInput.equals(""))
            {    
                Double a = Double.parseDouble(firstInput);
                Double b = Double.parseDouble(secondInput);
                Double procentDouble = a * b / 100;
                if(inputLabelString.contains("+"))
                {
                    String[] stringArray = inputLabelString.split("\\+");
                    inputLabelString = stringArray[0] + "+";
                    
                }else if(inputLabelString.contains("-"))
                {
                    String[] stringArray = inputLabelString.split("\\-");
                    inputLabelString = stringArray[0] + "-";
                    
                }else if(inputLabelString.contains("*"))
                {
                    String[] stringArray = inputLabelString.split("\\*");
                    inputLabelString = stringArray[0] + "*";
                    
                }else if(inputLabelString.contains("÷"))
                {
                    String[] stringArray = inputLabelString.split("\\÷");
                    inputLabelString = stringArray[0] + "÷";
                } 
                // check for integer/double value
                  if(checkForInteger(procentDouble))
                  {
                      bigLabel.setText(String.valueOf(procentDouble.intValue()));
                      secondInput = String.valueOf(procentDouble.intValue());
                  }else{
                      bigLabel.setText(procentDouble.toString());
                      secondInput = String.valueOf(procentDouble);
                  }
            }
        }
    });
        backSpaceBtn.addActionListener((ActionEvent e) -> {
            if(!bigLabel.getText().equals("0"))
            {
                String string = "";
                if(switchInput == false)
                {
                   string = firstInput;
                   string = string.substring(0, string.length()-1);
                   bigLabel.setText(numberFormat.format(Double.valueOf(string)));
                   firstInput = string;
                }else{
                   string = secondInput;
                   string = string.substring(0, string.length()-1);
                   bigLabel.setText(numberFormat.format(Double.valueOf(string)));
                   secondInput = string;
                }
            }
        });
        clearLastBtn.addActionListener((ActionEvent e) -> {

            if(!firstInput.equals(""))
            {
                firstInput = "";
            }else{
                secondInput = "";
            }
            bigLabel.setText("0");
            System.out.println("prvi: " + firstInput + ", drugi: " + secondInput);
        });
        clearBtn.addActionListener((ActionEvent e) -> {
            inputLabelString = "";
            numberList.clear();
            switchInput = false;
            firstInput = "";
            secondInput = "";
            smallLabel.setText("");
            bigLabel.setText("0");
            
        });
        rootBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(!firstInput.equals(""))
                {
                    String s = "";
                    if(bigLabel.getText().contains(","))
                    {
                        String[] array = bigLabel.getText().split(",");
                        for (int i = 0; i < array.length; i++) {
                            s += array[i];
                        }
                        Double rootDouble = Math.sqrt(Double.valueOf(s));

                        smallLabel.setText(inputLabelString + "√" + "(" + s + ")");
                        // check for integer/double value
                        if(checkForInteger(rootDouble))
                        {   // check which operand is free
                            if(s.equals(firstInput))
                            {
                                firstInput = String.valueOf(rootDouble.intValue());
                                bigLabel.setText(String.valueOf(rootDouble.intValue()));
                            }else{
                                secondInput = String.valueOf(rootDouble.intValue());
                                bigLabel.setText(String.valueOf(rootDouble.intValue()));
                            } 
                        }else{
                            if(s.equals(firstInput))
                            {
                                firstInput = String.valueOf(rootDouble);
                                bigLabel.setText(String.valueOf(rootDouble));
                            }else{
                                secondInput = String.valueOf(rootDouble);
                                bigLabel.setText(String.valueOf(rootDouble));
                            }
                        }
                    }else{
                        Double rootDouble = Math.sqrt(Double.valueOf(bigLabel.getText()));

                        smallLabel.setText(inputLabelString + "√" + "(" + firstInput + ")");
                        // check for integer/double value
                        if(checkForInteger(rootDouble))
                        {   // check which operand is free
                            if(bigLabel.getText().equals(firstInput))
                            {
                                firstInput = String.valueOf(rootDouble.intValue());
                                bigLabel.setText(String.valueOf(rootDouble.intValue()));
                            }else{
                                secondInput = String.valueOf(rootDouble.intValue());
                                bigLabel.setText(String.valueOf(rootDouble.intValue()));
                            }
                        }else{
                            if(bigLabel.getText().equals(firstInput))
                            {
                               firstInput = String.valueOf(rootDouble);
                               bigLabel.setText(rootDouble.toString()); 
                            }else{
                                secondInput = String.valueOf(rootDouble);
                                bigLabel.setText(String.valueOf(rootDouble));
                            }
                        } 
                    } 
                }
            }    
        });
        
        squareBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!firstInput.equals(""))
                {
                    String s = "";
                    if(bigLabel.getText().contains(","))
                    {
                        String[] array = bigLabel.getText().split(",");
                        for (int i = 0; i < array.length; i++) {
                            s += array[i];
                        }
                        Double squareDouble = (Double.valueOf(s) * Double.valueOf(s));
                        smallLabel.setText(inputLabelString + "sqr" + "(" + s + ")");
                        // check for integer/double value
                        if(checkForInteger(squareDouble))
                        {   // check which operand is free
                            if(s.equals(firstInput))
                            {
                                firstInput = String.valueOf(squareDouble.intValue());
                                bigLabel.setText(numberFormat.format(squareDouble.intValue()));
                            }else{
                                secondInput = String.valueOf(squareDouble.intValue());
                                bigLabel.setText(numberFormat.format(squareDouble.intValue()));
                            }
                        }else{
                            if(s.equals(firstInput))
                            {
                                firstInput = String.valueOf(squareDouble);
                                bigLabel.setText(numberFormat.format(squareDouble));
                            }else{
                                secondInput = String.valueOf(squareDouble);
                                bigLabel.setText(numberFormat.format(squareDouble));
                            }
                        }
                    }else{
                        s = bigLabel.getText();
                        Double squareDouble = (Double.valueOf(s) * Double.valueOf(s));
                        smallLabel.setText(inputLabelString + "sqr" + "(" + s + ")");

                        if(checkForInteger(squareDouble))
                        {   
                            if(bigLabel.getText().equals(firstInput))
                            {
                               firstInput = String.valueOf(squareDouble.intValue());
                               bigLabel.setText(numberFormat.format(squareDouble.intValue())); 
                            }else{
                                secondInput = String.valueOf(squareDouble.intValue());
                                bigLabel.setText(numberFormat.format(squareDouble.intValue())); 
                            }
                        }else{
                            if(bigLabel.getText().equals(firstInput))
                            {
                                firstInput = String.valueOf(squareDouble);
                                bigLabel.setText(numberFormat.format(squareDouble));
                            }else{
                                secondInput = String.valueOf(squareDouble);
                                bigLabel.setText(numberFormat.format(squareDouble));
                            }
                        }
                    }
                }
            }
        });
        divideWithOneBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!firstInput.equals(""))
                {
                    String s = "";
                    if(bigLabel.getText().contains(","))
                    {
                        String[] array = bigLabel.getText().split(",");
                        for (int i = 0; i < array.length; i++) {
                            s += array[i];
                        }  
                        Double divideWithOne = 1 / Double.valueOf(s);
                        // check which operand is free
                        if(s.equals(firstInput))
                        {
                            smallLabel.setText(inputLabelString + "1/(" + s + ")");
                            bigLabel.setText(divideWithOne.toString());
                            firstInput = String.valueOf(divideWithOne);
                            inputLabelString = ""; 
                        }else{
                            smallLabel.setText(inputLabelString + "1/(" + s + ")");
                            bigLabel.setText(divideWithOne.toString());
                            secondInput = String.valueOf(divideWithOne);
                            inputLabelString = ""; 
                        }   
                    }else{
                        s = bigLabel.getText();
                        Double divideWithOne = 1 / Double.valueOf(s);
                        // check which operand is free
                        if(bigLabel.getText().equals(firstInput))
                        {
                            smallLabel.setText(inputLabelString + "1/(" + s + ")");
                            bigLabel.setText(divideWithOne.toString());
                            firstInput = String.valueOf(divideWithOne);
                            inputLabelString = "";
                        }else{
                            smallLabel.setText(inputLabelString + "1/(" + s + ")");
                            bigLabel.setText(divideWithOne.toString());
                            secondInput = String.valueOf(divideWithOne);
                            inputLabelString = "";
                        } 
                    }
                }
            }
        });
    }
//______________________________________________________________________________ Method to check sign for plus operation

      
private String checkLastSignPlus(String string)
{
   String s = string.substring(string.length()-1);
   String ret = string.substring(0, string.length()-1);


   if(s.equals("-") || s.equals("*") || s.equals("÷"))
    {
        numberList.remove(numberList.size()-1);
        numberList.add(numberList.size(), "+");
        
        if(numberList.contains(""))
        {
            numberList.remove("");
        }
        return ret + "+";
    }else if(string.endsWith("+"))
    {
        return string;
    }else
    {
        numberList.add("+");
        return string + "+";
    }

}

//______________________________________________________________________________ Method to check sign for minus operation

private String checkLastSignMinus(String string)
{
   String s = string.substring(string.length()-1);
   String ret = string.substring(0, string.length()-1);
 

   if(s.contains("+") || s.contains("*") || s.contains("÷"))
    {
        numberList.remove(numberList.size()-1);
        numberList.add(numberList.size(), "-");
        
        if(numberList.contains(""))
        {
            numberList.remove("");
        }

        return ret + "-";
    }else if (string.endsWith("-"))
   {
       return string ;
   }else{     

        numberList.add("-");
        return string + "-";
    }    

}

//______________________________________________________________________________ Method to check sign for multiple operation

 private String checkLastSignMultiple(String string)
{
    
   String s = string.substring(string.length()-1);
   String ret = string.substring(0, string.length()-1);
 

   if(s.contains("+") || s.contains("-") || s.contains("÷"))
    {
        numberList.remove(numberList.size()-1);
        numberList.add(numberList.size(), "*");
        
        if(numberList.contains(""))
        {
            numberList.remove("");
        }
        return ret + "*";
    }else if (string.endsWith("*"))
   {
       return string ;
   }else{     

        numberList.add("*");
        return string + "*";
    }    

}
//_______________________________________________________________________________Method to check sign for divide operation
        
 private String checkLastSignDivide(String string)
{
   String s = string.substring(string.length()-1);
   String ret = string.substring(0, string.length()-1);
 
   if(s.contains("+") || s.contains("*") || s.contains("-"))
    {
        numberList.remove(numberList.size()-1);
        numberList.add(numberList.size(), "÷");
        
        if(numberList.contains(""))
        {
            numberList.remove("");
        }
        return ret + "÷";
    }else if (string.endsWith("÷"))
   {
       return string ;
   }else{     
        numberList.add("÷");
        return string + "÷";
    }    
}       
//______________________________________________________________________________Method to calculate
private void calculate()
   {
       for (int i = 0; i < numberList.size()-1; i++) 
       {
           switch (numberList.get(i)) {
               case "+":
                           resultDouble = Double.valueOf(numberList.get(i-1)) + Double.valueOf(numberList.get(i+1));
                           numberList.clear();
                           numberList.add(0, resultDouble.toString());
                           bigLabel.setText(numberFormat.format(resultDouble));
                           firstInput = String.valueOf(numberFormat.format(resultDouble));
                           secondInput = "";
                   break;
               case "-":
                   
                           resultDouble = Double.valueOf(numberList.get(i-1)) - Double.valueOf(numberList.get(i+1));
                           numberList.clear();
                           numberList.add(0, resultDouble.toString());
                           bigLabel.setText(numberFormat.format(resultDouble));
                           firstInput = String.valueOf(numberFormat.format(resultDouble));
                           secondInput = "";
                   break;
               case "*":
                           resultDouble = Double.valueOf(numberList.get(i-1)) * Integer.valueOf(numberList.get(i+1));
                           numberList.clear();
                           numberList.add(0, resultDouble.toString());
                           bigLabel.setText(numberFormat.format(resultDouble));
                           firstInput = String.valueOf(numberFormat.format(resultDouble));
                           secondInput = "";
                   break;
               case "÷":
                   if(!numberList.get(i+1).equals("0"))
                   {
                           resultDouble = Double.valueOf(numberList.get(i-1)) / Double.valueOf(numberList.get(i+1));
                           numberList.clear();
                           bigLabel.setText(numberFormat.format(resultDouble)); 
                           firstInput = String.valueOf(numberFormat.format(resultDouble));
                           secondInput = "";
                   }else{
                       bigLabel.setText("Can not divide by 0");
                   }
                   break;
               default:
                   break;
           }
       }
   }
// _____________________________________________________________________________ Method to check is number integer or double type
private boolean checkForInteger(Double checkThisNumber)
{
    Integer showInteger = checkThisNumber.intValue();
    if(checkThisNumber == showInteger.doubleValue())
    {
        return true;
    }else{
        return false;
    }
}
}
