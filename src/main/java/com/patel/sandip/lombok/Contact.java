package com.patel.sandip.lombok;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter // Default access level is public
@Setter// Default access level is public
@ToString(includeFieldNames = false, of = {"id", "name"})
@EqualsAndHashCode(of = {"id", "name", "contactNo", "address"})

public class Contact {

    private Long id;
    private String name;
    private String contactNo;
    private String address;
}
