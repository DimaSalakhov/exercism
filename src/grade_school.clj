 (ns grade-school)

 (defn add
   [db name grade]
   (merge-with concat db {grade [name]}))

 (defn grade [db grade]
   (db grade []))

 (defn sorted [db]
   (reduce (fn [m [k v]](assoc m k (sort v))) {} (sort-by key > db)))


