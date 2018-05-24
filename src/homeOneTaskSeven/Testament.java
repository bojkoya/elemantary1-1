package homeOneTaskSeven;

import java.io.*;
import java.util.ArrayList;

public class Testament {  public static void main(String[] args)  throws IOException, FileNotFoundException
{
    File file = null;
    LineNumberReader buff = null;
    FileReader fr   = null;
    Stack             stack;
    try
    {
        stack = new Stack();
        file  = new File("c:","1.txt");
        fr    = new FileReader(file);
        buff  = new LineNumberReader(fr);
        String s;
        while((s=buff.readLine())!=null)
        {
            //System.out.println("*"+buff.getLineNumber()+"*"+"   "+s);
            stack.push(s.toString());
        }

        System.out.println("Количество символов: "+file.length());
        System.out.println("Количество строк: "+stack.getSize());

    }
    finally
    {
        if(fr!=null)
            fr.close();
        if(buff!=null)
            fr.close();
    }

}

}

class Stack
{

    private ArrayList<String> list = new ArrayList<String>();

    public void push(String lnre)
    {
        list.add(lnre);
    }
    @Override
    public String toString()
    {
        return list.toString();
    }
    public int getSize()
    {
        return list.size();
    }
}