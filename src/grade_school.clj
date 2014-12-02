 (ns grade-school)

 (defn add
   [db name grade]
   (merge-with concat db {grade [name]}))

 (defn grade [db grade]
   (db grade []))

 (defn sorted [db]
   (reduce #(assoc %1 (key %2) (sort (val %2))) {} (sort-by key > db)))


