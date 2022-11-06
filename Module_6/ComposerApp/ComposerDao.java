/* Zuck, C. (2022). CIS 505 Intermediate Java Programming. Bellevue University. 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: Comprehensive Version (12th ed.). Pearson Education, Inc.

Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved. */

package Module_6.ComposerApp;

public interface ComposerDao extends GenericDao<Composer, Integer>{ /* This extends GenericDao to Composers and includes the abstract methods. Composer and Integer take the place of K and E in the GenericDao class. */
}
