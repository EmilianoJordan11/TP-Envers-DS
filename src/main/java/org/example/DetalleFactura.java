package org.example;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Audited
public class DetalleFactura implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int cantidad;
    private int subtotal;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="fk_articulo")
    private Articulo articulo;
}
