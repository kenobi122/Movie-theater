package com.movie.theater.service;

import com.movie.theater.model.request.InvoiceRequest;
import com.movie.theater.model.response.InvoiceResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InvoiceService {
    List<InvoiceResponse> findAll();
    InvoiceResponse create(InvoiceRequest invoiceRequest);
}
