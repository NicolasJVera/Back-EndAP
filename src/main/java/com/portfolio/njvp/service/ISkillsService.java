
package com.portfolio.njvp.service;

import com.portfolio.njvp.entity.Skills;
import java.util.List;

public interface ISkillsService {

    public void saveSkills(Skills skills);

    public void deleteSkills(int id);

    public List<Skills> traerSkills();

    public Skills traerSkillsPorId(int id);
}
