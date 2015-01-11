 (ns space-age)

 (def earth-period 31557600)

 (defn calculate-age [seconds modifier]
  (-> (/ seconds earth-period)
      (/ modifier)))

 (defn on-earth [seconds]
  (calculate-age seconds 1))

 (defn on-mercury [seconds]
  (calculate-age seconds 0.2408467))

 (defn on-venus [seconds]
  (calculate-age seconds 0.61519726))

 (defn on-mars [seconds]
  (calculate-age seconds 1.8808158))

 (defn on-jupiter [seconds]
  (calculate-age seconds 11.862615))

 (defn on-uranus [seconds]
  (calculate-age seconds 84.016846))

 (defn on-neptune [seconds]
  (calculate-age seconds 164.79132))

 (defn on-saturn [seconds]
  (calculate-age seconds 29.447498))