package io.github.swanky.service.currentuser;

import org.springframework.stereotype.Service;

import io.github.swanky.domain.CurrentUser;
import io.github.swanky.domain.Role;
import lombok.extern.slf4j.Slf4j;

@Service @Slf4j
public class CurrentUserServiceImpl implements CurrentUserService {

    @Override
    public boolean canAccessUser(CurrentUser currentUser, Long userId) {
        log.debug("Checking if user={} has access to user={}", currentUser, userId);
        return currentUser != null
                && (currentUser.getRole() == Role.ADMIN || currentUser.getId().equals(userId));
    }

}