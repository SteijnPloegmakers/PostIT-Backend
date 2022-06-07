package com.sem4.PostIT.Controller;

import com.sem4.PostIT.Model.Channel;
import com.sem4.PostIT.Repo.ChannelRepo;
import com.sem4.PostIT.Service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ChannelController {

    @Autowired
    private ChannelRepo channelRepo;

    @Autowired
    private ChannelService channelService;

    @PostMapping(value = "api/channel/save")
    public String saveChannel(Channel channel) {

        channelRepo.save(channel);

        return "Saved Channel";
    }

    @GetMapping(value = "api/channels")
    public List<Channel> getChannel() {return channelService.getAllChannels();}
}
