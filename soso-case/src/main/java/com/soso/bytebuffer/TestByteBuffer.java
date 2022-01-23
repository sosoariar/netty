package com.soso.bytebuffer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class TestByteBuffer {

    public static void main(String[] args){

        // FileChannel
        // 输入输出流
        // RandomAccessFile
        try(FileChannel channel = new FileInputStream("data.txt").getChannel()){

            // 准备缓冲区
            ByteBuffer buffer = ByteBuffer.allocate(10);

            // 从 channel 读取数据,向buffer写入
            channel.read(buffer);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
