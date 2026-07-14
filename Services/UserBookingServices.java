package Services;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;


public class UserBookingServices {
    private User user;
    private List<User> userList;

    private final ObjectMapper objectMapper = new ObjectMapper();
    private static final String USERS_PATH = "../localdb/user.json";

    public UserBookingServices(User user1) throws IOException {
        this.user = user1;
        File users = new File(USERS_PATH);
        userList = objectMapper.readValue(users, new TypeReference<List<User>>() {});

        public Boolean loginUser();{
            optional<User> foundUser = userList.stream()
                    .filter(u -> u.getName().equals(user.getName()) && u.getPassword().equals(user.getPassword()))
                    .findFirst();
                    return foundUser.isPresent();
        }

        public Boolean signUp(User user1) throws IOException {
             try { 
                userList.add(user1);
                SaveUserListtoFile();
                return Boolean.TRUE;
            }
            catch (IOException e) {
                return Boolean.FALSE;
            }
            return false;
        }
    }
}