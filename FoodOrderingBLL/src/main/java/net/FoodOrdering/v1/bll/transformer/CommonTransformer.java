package net.FoodOrdering.v1.bll.transformer;

public interface CommonTransformer<E, B> {

    public B transformEntityToBean(E entity, String lang);

    public E transformBeanToEntity(B bean);
}
