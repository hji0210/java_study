package practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data 
@NoArgsConstructor
@AllArgsConstructor
public class Member {
  private String id;
  @NonNull private String name;
  private int age;
	 
	 
}
