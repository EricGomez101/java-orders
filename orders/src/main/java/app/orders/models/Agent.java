package app.orders.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "agents")
public class Agent
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long agentcode;

    @OneToMany(cascade = CascadeType.DETACH, mappedBy = "agent")
    private Set<Customer> customers;

    @OneToMany( cascade = CascadeType.DETACH, mappedBy = "agent")
    private Set<Order> orders;

    private String agentname;

    private String workingarea;

    private double commission;

    private String phone;

    private String country;

    public Agent()
    {
    }
}