package com.sem4.PostIT.Repo;

import com.sem4.PostIT.Model.Channel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ChannelRepo extends JpaRepository<Channel, UUID> {

}
