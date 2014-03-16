(defproject gateau "0.1.0-SNAPSHOT"
  :description "declarative-ish HTTP stuff"
  :url "https://github/rweir/gateau"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [cheshire "5.3.1"]
                 [clj-logging-config "1.9.10"]
                 [com.netflix.hystrix/hystrix-clj "1.3.13"]
                 [http-kit "2.1.16"]]
  :scm {:name "git"
        :url "ssh://git@github.com:rweir/gateau.git"})

