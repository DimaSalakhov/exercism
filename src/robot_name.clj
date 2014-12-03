 (ns robot-name)

 (defn generate-name []
  (let [AZ (range 65 91)]
   (format "%1$s%2$s%3$03d" (char (rand-nth AZ)) (char (rand-nth AZ)) (rand-int 1000))))

 (defn robot []
  (atom {:name (generate-name)}))

 (defn robot-name [robot]
  (:name @robot))

 (defn reset-name [robot]
  (swap! robot assoc :name (generate-name)))
