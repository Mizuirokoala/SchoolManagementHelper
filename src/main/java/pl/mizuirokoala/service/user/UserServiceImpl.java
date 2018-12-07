package pl.mizuirokoala.service.user;

import org.springframework.stereotype.Service;
import pl.mizuirokoala.model.User;

import javax.transaction.Transactional;


@Service
@Transactional
public class UserServiceImpl implements UserService {


    @Override
    public User user(long id) {
        return null;
    }

    @Override
    public User register(User user) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public User changePassword(long userId, String password) {
        return null;
    }
}

