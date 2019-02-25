package ${package}.${artifactId}.security;

import ${package}.${artifactId}.model.Account;
import ${package}.${artifactId}.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl extends AbstractExtendedUserDetailsService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    protected Account getAccountByEmail(String email) {
        return accountRepository.getByEmailWithRoles(email);
    }
}
