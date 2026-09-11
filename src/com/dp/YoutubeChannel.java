package com.dp;

import com.dsa.designpaatern.command.Light;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{
    private String lastVedios;
    List<ObServer> subScriberList=new ArrayList<>();
    @Override
    public void subSrcibe(ObServer obServer) {
        subScriberList.add(obServer);
    }

    @Override
    public void UnSubSrcibe(ObServer obServer) {
    subScriberList.remove(obServer);
    }

    @Override
    public void notfiocation() {
       for(ObServer obServer:subScriberList){
           obServer.update();
       }
    }
    public void uploadvedios(String lastVedios){
        this.lastVedios=lastVedios;
        System.out.println("latestVedios Uploaded:"+lastVedios);
        notfiocation();
    }
}
