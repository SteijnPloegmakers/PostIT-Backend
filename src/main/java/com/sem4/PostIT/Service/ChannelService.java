package com.sem4.PostIT.Service;

import com.sem4.PostIT.Model.Channel;
import com.sem4.PostIT.Model.Comment;
import com.sem4.PostIT.Repo.ChannelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChannelService {

    @Autowired
    private ChannelRepo channelRepo;

    public List<Channel> getAllChannels(){
        return channelRepo.findAll();
    }
}
