package com.movie.theater.repository;

import com.movie.theater.model.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITicketRepository extends JpaRepository<Ticket, Integer>{
}
