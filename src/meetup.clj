 (ns meetup
  (:import (java.util Calendar)))

 (def days-of-the-week {:monday 2 :tuesday 3 :wednesday 4 :thursday 5 :friday 6 :saturday 7 :sunday 1})
 (def weeks {:first 1 :second 2 :third 3 :fourth 4 :teenth 2 :last 4})

 (defn get-week
  [year month week-start]
  (let [cal (Calendar/getInstance)]
   (.set cal Calendar/YEAR year)
   (.set cal Calendar/MONTH (dec month))
   (.set cal Calendar/DAY_OF_MONTH week-start)
   (.get cal Calendar/DAY_OF_WEEK)))

 (defn date-after
  [di da]
  (if (> di da)
   (+ (- 7 di) da)
   (- da di)))

 (defn calculate-day
  [year month day week]
  (let [week-start (+ (* (dec week) 7) 1)]
    (+ week-start (date-after (get-week year month week-start) day))))

 (defn meetup
  [month year day week]
  (vector year month (calculate-day year month (days-of-the-week day) (weeks week))))