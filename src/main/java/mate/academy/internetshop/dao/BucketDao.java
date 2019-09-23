package mate.academy.internetshop.dao;

import mate.academy.internetshop.models.Bucket;

public interface BucketDao {
    Bucket add(Bucket bucket);

    Bucket get(Long bucketId);

    Bucket update(Bucket bucket);

    Bucket delete(Long bucketId);
}
