(ns tests.app-spec
  (:require ["@testing-library/react-native" :as rtl]
            ["react-native" :as rn]
            [reagent.core :as reagent]
            [tests.matchers]
            [app :as app]))

(defn render
  ([]
   (render {}))
  ([opts]
   (rtl/render (reagent/as-element [app/app]))))

(js/test "initial screen"
         (fn []
           (render)
           (-> (js/expect  (rtl/screen.getByText "hello world"))
               (.toBeTruthy))))

