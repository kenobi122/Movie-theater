package com.movie.theater.service;

import com.movie.theater.model.request.TicketRequest;
import com.movie.theater.model.response.TicketResponse;

public interface ITicketService {
    public void create(TicketRequest ticketRequest);
    public TicketResponse read(TicketRequest ticketRequest);
}
