package dao.impl;

import javax.ejb.Stateless;

import dao.TagDao;
import model.Tag;

@Stateless
public class TagDaoImpl extends BaseDaoImpl<Tag, Integer> implements TagDao {
   

    public TagDaoImpl() {
        super(Tag.class);
    }

}
