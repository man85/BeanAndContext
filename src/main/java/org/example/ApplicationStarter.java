package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationStarter {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        Music music=context.getBean("BeanMusic",Music.class);
        MusicPlayer musicPlayer=new MusicPlayer(music);
        musicPlayer.playMusic();
        context.close();

    }
}
