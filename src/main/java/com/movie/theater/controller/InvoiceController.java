package com.movie.theater.controller;

import com.movie.theater.model.request.InvoiceRequest;
import com.movie.theater.model.response.InvoiceResponse;
import com.movie.theater.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {

    private final InvoiceService invoiceService;

    @Autowired
    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping(value = "/get-invoices")
    public List<InvoiceResponse> getInvoices(){
        return invoiceService.findAll();
    }

    @PostMapping(value = "/post")
    public InvoiceResponse createInvoice(@RequestBody InvoiceRequest invoiceRequest) {
        return invoiceService.create(invoiceRequest);
    }
}
