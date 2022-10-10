/* Zuck, C. (2022). CIS 505 Intermediate Java Programming. Bellevue University. 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: Comprehensive Version (12th ed.). Pearson Education, Inc.

Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved. */

package Module_6.ComposerApp;

import java.util.*;

public interface GenericDao<E, K> {
    List <E> findAll();
    E findBy(K key);
    void insert(E entity);
}
