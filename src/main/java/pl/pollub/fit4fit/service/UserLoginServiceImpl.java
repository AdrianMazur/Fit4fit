package pl.pollub.fit4fit.service;

import lombok.AllArgsConstructor;
import pl.pollub.fit4fit.dto.UserLoginDto;
import pl.pollub.fit4fit.mapper.UserLoginMapper;
import pl.pollub.fit4fit.repository.UserLoginRepository;

@AllArgsConstructor
public class UserLoginServiceImpl implements UserLoginService{

    private final UserLoginRepository userLoginRepository;
    private final UserLoginMapper userLoginMapper;


    public void addUserLogin(UserLoginDto dto){
        var saveObject = userLoginRepository.save(userLoginMapper.mapToEntity(dto));
    }

    public void deleteById(Long id){
        userLoginRepository.deleteById(id);
    }
    public void update(Long id){

    }
}
