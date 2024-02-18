package com.startech.person.entities.user;

import java.util.Date;

import org.hibernate.annotations.Formula;
import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.startech.person.core.entities.base.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "user", schema = "person")
public class User extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Column(nullable = true, length = 24, unique = true)
	@Length(min = 0, max = 24)
	private String identityNumber;

	@NotNull
	@Column(nullable = false, length = 32)
	@Length(min = 1, max = 32)
	private String name;

	@NotNull
	@Column(nullable = false, length = 32)
	@Length(min = 1, max = 32)
	private String surname;

	@Formula("concat(name,' ',surname)")
	private String nameSurname;

	@Temporal(TemporalType.DATE)
	@Column(nullable = true)
	@JsonFormat(pattern = "dd-MM-yyyy", timezone = "Asia/Istanbul")
	Date birthDate;

	@Column(nullable = true, length = 64)
	@Length(min = 0, max = 64)
	private String email;

	@Column(nullable = true, length = 24)
	@Length(min = 0, max = 24)
	private String phone1;

	@Column(nullable = true, length = 24)
	@Length(min = 0, max = 24)
	private String phone2;

	@Column(nullable = true, length = 24)
	@Length(min = 0, max = 24)
	private String phone3;

	@Column(nullable = true, length = 1024)
	@Length(min = 0, max = 1024)
	private String address;
}
