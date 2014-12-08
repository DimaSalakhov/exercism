 (ns meetup
  (:import (java.util Calendar)))

 (def days-of-the-week {:monday 2 :tuesday 3 :wednesday 4 :thursday 5 :friday 6 :saturday 7 :sunday 1})
 (defn start-of-the-period
  [month week-keycode]
  (case week-keycode
   :first 1
   :second 8
   :third 15
   :fourth 22
   :teenth 13
   :last (if (= 2 month) 23 25)))

 (defn get-day-of-week
  [year month week-start]
  (let [cal (Calendar/getInstance)]
   (.set cal Calendar/YEAR year)
   (.set cal Calendar/MONTH (dec month))
   (.set cal Calendar/DAY_OF_MONTH week-start)
   (.get cal Calendar/DAY_OF_WEEK)))

 (defn days-offset
  "Calculates offset in days between 2 days of the week"
  [from to]
  (if (> from to)
   (+ (- 7 from) to)
   (- to from)))

 (defn calculate-day
  [year month week-start day-of-the-week]
  (+ week-start (days-offset (get-day-of-week year month week-start) day-of-the-week)))

 (defn meetup
  [month year day-of-the-week week]
  (vector year
          month
          (calculate-day year
                         month
                         (start-of-the-period month week)
                         (days-of-the-week day-of-the-week))))