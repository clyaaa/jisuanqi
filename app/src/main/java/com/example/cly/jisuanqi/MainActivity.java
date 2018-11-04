package com.example.cly.jisuanqi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Vector;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnpoi,btnplus,btnmi,btnmul,btndiv,btnmo,btnequal,btndel,btnce,btnpre,btnlas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0=(Button)findViewById(R.id.button0);
        btn1=(Button)findViewById(R.id.button1);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        btn4=(Button)findViewById(R.id.button4);
        btn5=(Button)findViewById(R.id.button5);
        btn6=(Button)findViewById(R.id.button6);
        btn7=(Button)findViewById(R.id.button7);
        btn8=(Button)findViewById(R.id.button8);
        btn9=(Button)findViewById(R.id.button9);
        btnpoi=(Button)findViewById(R.id.buttonpoint);
        btnequal=(Button)findViewById(R.id.buttonequal);
        btnplus=(Button)findViewById(R.id.buttonplus);
        btnmi=(Button)findViewById(R.id.buttonminus);
        btnmul=(Button)findViewById(R.id.buttonmul);
        btndiv=(Button)findViewById(R.id.buttondiv);
        btnmo=(Button)findViewById(R.id.buttonmo);
        btndel=(Button)findViewById(R.id.buttondel);
        btnce=(Button)findViewById(R.id.buttonclear);
        btnpre=(Button)findViewById(R.id.buttonpre);
        btnlas=(Button)findViewById(R.id.buttonla);
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnpoi.setOnClickListener(this);
        btnequal.setOnClickListener(this);
        btnplus.setOnClickListener(this);
        btnmi.setOnClickListener(this);
        btnmul.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btnmo.setOnClickListener(this);
        btndel.setOnClickListener(this);
        btnce.setOnClickListener(this);
        btnpre.setOnClickListener(this);
        btnlas.setOnClickListener(this);
    }
    public void onClick(View view) {
        TextView textView=findViewById(R.id.textview);
        Button btn=(Button)view;
        switch(btn.getId()){
            case R.id.button0:{
                String str=textView.getText().toString();
                str+="0";
                textView.setText(str);
                break;
            }
            case R.id.button1:{
                String str=textView.getText().toString();
                str+="1";
                textView.setText(str);
                break;
            }
            case R.id.button2:{
                String str=textView.getText().toString();
                str+="2";
                textView.setText(str);
                break;
            }
            case R.id.button3:{
                String str=textView.getText().toString();
                str+="3";
                textView.setText(str);
                break;
            }
            case R.id.button4:{
                String str=textView.getText().toString();
                str+="4";
                textView.setText(str);
                break;
            }
            case R.id.button5:{
                String str=textView.getText().toString();
                str+="5";
                textView.setText(str);
                break;
            }
            case R.id.button6:{
                String str=textView.getText().toString();
                str+="6";
                textView.setText(str);
                break;
            }
            case R.id.button7:{
                String str=textView.getText().toString();
                str+="7";
                textView.setText(str);
                break;
            }
            case R.id.button8:{
                String str=textView.getText().toString();
                str+="8";
                textView.setText(str);
                break;
            }
            case R.id.button9:{
                String str=textView.getText().toString();
                str+="9";
                textView.setText(str);
                break;
            }
            case R.id.buttonpoint:{
                String str=textView.getText().toString();
                str+=".";
                textView.setText(str);
                break;
            }
            case R.id.buttonplus:{
                String str=textView.getText().toString();
                str+="+";
                textView.setText(str);
                break;
            }
            case R.id.buttonminus:{
                String str=textView.getText().toString();
                str+="-";
                textView.setText(str);
                break;
            }
            case R.id.buttonmul:{
                String str=textView.getText().toString();
                str+="*";
                textView.setText(str);
                break;
            }
            case R.id.buttondiv:{
                String str=textView.getText().toString();
                str+="/";
                textView.setText(str);
                break;
            }
            case R.id.buttonmo:{
                String str=textView.getText().toString();
                str+="%";
                textView.setText(str);
                break;
            }
            case R.id.buttonclear:{
                String str=textView.getText().toString();
                str="";
                textView.setText(str);
                break;
            }
            case R.id.buttondel:{
                String str=textView.getText().toString();
                str = str.substring(0,str.length() - 1);
                textView.setText(str);
                break;
            }
            case R.id.buttonpre:{
                String str=textView.getText().toString();
                str +="(";
                textView.setText(str);
                break;
            }
            case R.id.buttonla:{
                String str=textView.getText().toString();
                str +=")";
                textView.setText(str);
                break;
            }
            case R.id.buttonequal:{
                String str=textView.getText().toString();

                char[] ch=str.toCharArray();
                int length=ch.length,i=0;
                String yuju="";
                Vector list=new Vector();
                while(i<length){
                    if((ch[i]=='0')||(ch[i]=='1')||(ch[i]=='2')||(ch[i]=='3')||(ch[i]=='4')||(ch[i]=='5')||(ch[i]=='6')||(ch[i]=='7')||(ch[i]=='8')||(ch[i]=='9')||(ch[i]=='.')){
                        yuju+=ch[i];
                        if(i==(length-1)){
                            list.add(yuju);
                        }
                    }
                    else if((ch[i]=='+')||(ch[i]=='-')||(ch[i]=='*')||(ch[i]=='/')||(ch[i]=='(')||(ch[i]==')')){
                        if(yuju!=""){
                            list.add(yuju);
                        }
                        list.add(ch[i]+"");
                        yuju="";
                    }
                    i++;
                }
        /*LinkStack linkstack=new LinkStack();//堆栈测试语句
        int n=0;

        while(n<list.size()){
            linkstack.push((String)list.elementAt(n));
            n++;
        }
        while(linkstack.top!=null){
            System.out.print(linkstack.pop());
        }*/
                int n=0;
                Vector v=new Vector();//存储数字的数组
                LinkStack linkstack=new LinkStack();
                while(n<list.size()){
                    String s=list.elementAt(n)+"";//使用String强制类型转化好像不行
                    ZiFu zf=new ZiFu(s);
                    if(zf.flag==1){//如果是运算符
                        if(linkstack.top==null){
                            linkstack.push(s);
                        }
                        else if(s.equals("(")){
                            linkstack.push(s);
                        }
                        else if(s.equals(")")){
                            String t=linkstack.pop();
                            while(!t.equals("(")){
                                v.add(t);
                                t=linkstack.pop();
                            }
                        }
                        else if(zf.yxj>linkstack.top.yxj){//如果优先级大于栈顶元素则入栈
                            linkstack.push(s);
                        }
                        else if(zf.yxj<=linkstack.top.yxj) {//优先级小于等于栈顶元素则栈顶元素出栈
                            while(zf.yxj<=linkstack.top.yxj){
                                v.add(linkstack.pop());
                                if(linkstack.top==null) {
                                    break;
                                }
                            }
                            linkstack.push(s);//将栈顶所有比目前元素优先级都要高的元素排除然后再将该元素入栈
                        }
                        else{
                            v.add(s);
                        }
                    }
                    else{
                        v.add(s);
                    }
                    n++;
                }
                String s=linkstack.pop();
                while(s!=null) {
                    v.add(s);
                    s=linkstack.pop();
                }
                LinkStack newlink=new LinkStack();
                n=0;
                while(n<v.size()) {
                    String p=v.get(n)+"";
                    boolean flag=!(p.equals("+")||p.equals("-")||p.equals("*")||p.equals("/"));
                    if(flag) {
                        newlink.push((String)v.get(n));
                    }
                    else {
                        double x=0,y=0,z = 0;
                        y=Double.parseDouble(newlink.pop());
                        x=Double.parseDouble(newlink.pop());
                        if(v.get(n).equals("+")) {
                            z=(x+y);
                        }
                        else if(v.get(n).equals("-")) {
                            z=(x-y);
                        }
                        else if(v.get(n).equals("*")) {
                            z=(x*y);
                        }
                        else if(v.get(n).equals("/")) {
                            z=(x/y);
                        }
                        newlink.push(String.valueOf(z));
                    }

                    n++;
                }
                textView.setText(newlink.pop());
            }
            //却事件的条件判断
        }
    }
}
class ZiFu{
    int yxj;//123还有-1
    int flag;//01
    String zifu;
    ZiFu(String zifu){
        this.zifu=zifu;
        if(zifu.equals("*")||zifu.equals("/")){//字符串相等用使用equal而不能直接用==
            flag=1;//表示是运算符
            yxj=2;
        }
        else if(zifu.equals("+")||zifu.equals("-")){
            flag=1;
            yxj=1;
        }
        else if(zifu.equals("(")||zifu.equals(")")){
            flag=1;
            yxj=0;
        }
        else{
            flag=0;
            yxj=-1;
        }
    }
}


class LinkStack<E> {
    Node<E> top;
    public LinkStack(){

    }
    public LinkStack(String element){
        top=new Node(element,null);
    }
    public void push(String element){
        top=new Node(element,top);
    }
    public String pop(){
        String str=null;
        if(top!=null){
            str=top.str;
            top=top.next;
        }
        return str;
    }
}

class Node<E> {
    String str;
    int yxj;//123还有-1
    int flag;//01
    Node<E> next;

    public Node(String str){
        this.str=str;
        this.next=null;
        if(str.equals("*")||str.equals("/")){//字符串相等用使用equal而不能直接用==
            flag=1;//表示是运算符
            yxj=2;
        }
        else if(str.equals("+")||str.equals("-")){
            flag=1;
            yxj=1;
        }
        else if(str.equals("(")||str.equals(")")){
            flag=1;
            yxj=0;
        }
        else{
            flag=0;
            yxj=-1;
        }
    }
    public Node(String str,Node<E> next){
        this.next=next;
        this.str=str;
        if(str.equals("*")||str.equals("/")){//字符串相等用使用equal而不能直接用==
            flag=1;//表示是运算符
            yxj=2;
        }
        else if(str.equals("+")||str.equals("-")){
            flag=1;
            yxj=1;
        }
        else if(str.equals("(")||str.equals(")")){
            flag=1;
            yxj=0;
        }
        else{
            flag=0;
            yxj=-1;
        }
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

}