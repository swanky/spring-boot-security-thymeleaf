package io.github.swanky.service.currentuser;

import io.github.swanky.domain.CurrentUser;

public interface CurrentUserService {

    boolean canAccessUser(CurrentUser currentUser, Long userId);

}