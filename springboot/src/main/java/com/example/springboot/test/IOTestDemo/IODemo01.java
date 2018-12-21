package com.example.springboot.test.IOTestDemo;

import com.example.springboot.pojo.UserEntity;
import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * * *  GOOK LUCK  * *
 *
 * @Author by   wukainian,
 * @Date on     2018/12/11.
 */
public class IODemo01 {


    /**
     * 写内容到文件
     * FileOutPutStream
     * write
     */
    @Test
    public void test01() {
        String filePath = "E:\\test\\test.txt";
        File file = new File(filePath);
            try {
                FileOutputStream outputStream = new FileOutputStream(file);
                byte[] b = "helloword".getBytes();
                outputStream.write(b);
                outputStream.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
    }

    /**
     * 读文件内容
     * FileOutPutStream
     * write
     */
    @Test
    public void test03() {
        String filePath = "E:\\test\\test.txt";
        File file = new File(filePath);
        try {
           FileInputStream inputStream = new FileInputStream(file);
            byte[] b = new byte[1024];
            int i = inputStream.read(b);
            System.out.println(new String(b,0,i));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }







    /**
     * 写内容到文件
     * FileWrite
     * write
     */
    @Test
    public void test04() {
        String filePath = "E:\\test\\test.txt";
        File file = new File(filePath);
        try {
           FileWriter fileWriter = new FileWriter(file);
           fileWriter.write("weghfghghffghllgcdfhfghm!");
           fileWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * 读文件内容
     * FileRead
     * write
     */
    @Test
    public void test05() {
        String filePath = "E:\\test\\test.txt";
        File file = new File(filePath);
        try {
            FileReader fileReader = new FileReader(file);
            char[] chars = new char[1024];
            int i = fileReader.read(chars);
            fileReader.close();
            System.out.println(new String(chars,0,i));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }





    @Test
    public void test02() throws Exception{
        String filePath = "E:\\test\\test.txt";
        UserEntity userEntity1 = new UserEntity(1L,"a",1,"a");
        UserEntity userEntity2 = new UserEntity(2L,"b",2,"b");
        UserEntity userEntity3 = new UserEntity(3L,"c",3,"c");
        RandomAccessFile ra = new RandomAccessFile(filePath,"x");
        ra.write(userEntity1.getName().getBytes());
        ra.writeInt(userEntity1.getSex());
        ra.write(userEntity2.getName().getBytes());
        ra.writeInt(userEntity2.getSex());
        ra.write(userEntity3.getName().getBytes());
        ra.writeInt(userEntity3.getSex());
        ra.close();
        RandomAccessFile ra1 = new RandomAccessFile(filePath,"x");
    }





    @Test
    public void test06() {
        try {
            Thread t1 = new Sender();
            Thread t2=new Receiver();
            PipedOutputStream out = ((Sender) t1).getOutputStream();
            PipedInputStream in = ((Receiver) t2).getInputStream();
            out.connect(in);
            t1.start();
            t2.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }






    @Test
    public void test07() {

        String filePath = "E:\\test\\test.txt";
        File file = new File(filePath);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);
            dataOutputStream.writeBytes("2sfsdgdfhthjhg11");
            dataOutputStream.writeBytes("3sfsdgdfhthjhg14");
            dataOutputStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }



    @Test
    public void test08() {
        String filePath = "E:\\test\\test.txt";
        File file = new File(filePath);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            UserEntity userEntity = new UserEntity(1L,"d",1,"dd");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(userEntity);
            objectOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }



    @Test
    public void test09() {
        String filePath = "E:\\test\\test.txt";
        File file = new File(filePath);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object o = objectInputStream.readObject();
            System.out.println(o);
            objectInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




@Test
public void test10() {

    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    try {
        String s = in.readLine();
        System.out.println("sfd");
    } catch (IOException e) {
        e.printStackTrace();
    }

}



































}
