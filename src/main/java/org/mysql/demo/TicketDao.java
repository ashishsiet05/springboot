package org.mysql.demo;



import org.springframework.data.repository.CrudRepository;



public interface TicketDao extends CrudRepository<Ticket, Integer> {

}