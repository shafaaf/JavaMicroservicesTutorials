import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
@Builder
public class EmployeeWithLombok {
    private String empId;
    private String firstName;
    private String lastname;
    private Date dob;
    private String phoneNo;
}
