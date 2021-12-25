package com.tistory.eclipse4j.domain.jpa.db1.entity;

import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;

@SuppressWarnings("serial")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Table(name = "reservation")
public class Reservation extends AuditingEntity implements Serializable{

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "customerId")
	private Long customerId;

	@Column(name = "productId")
	private Long productId;

	@Version
	private Long version;
}
