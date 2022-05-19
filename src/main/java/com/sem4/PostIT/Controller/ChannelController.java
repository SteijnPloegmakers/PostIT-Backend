package com.sem4.PostIT.Controller;

import com.sem4.PostIT.Model.Channel;
import com.sem4.PostIT.Repo.ChannelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ChannelController {

    @Autowired
    private ChannelRepo channelRepo;

    @PostMapping(value = "api/channel/save")
    public String saveChannel(Channel channel) {

        channelRepo.save(channel);

        return "Saved Channel";
    }
}
