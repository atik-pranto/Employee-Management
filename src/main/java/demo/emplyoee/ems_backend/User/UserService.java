package demo.emplyoee.ems_backend.User;

import java.security.Principal;

public interface UserService {

    void changePassword(ChangePasswordRequest request, Principal connectedUser);
}
