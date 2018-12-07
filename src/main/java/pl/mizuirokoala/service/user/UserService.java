package pl.mizuirokoala.service.user;

import pl.mizuirokoala.model.User;

public interface UserService {

    User user(long id);

    User register(User user);

    User update(User user);

    void delete(long id);

    User changePassword(long userId, String password);

}
