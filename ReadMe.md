# Shadow Jest - React Native

Essentially a copy of https://github.com/pesterhazy/shadow-jest except it is using React Native.

The purpose is just to give clojurescript developers a working example of using jest, shadow-cljs and react-native.

## Tools used:
It's using React Native Testing Library - https://callstack.github.io/react-native-testing-library/docs/api/#query-apis

The app was bootstrapped with create-react-native-app -
https://reactnative.dev/blog/2017/03/13/introducing-create-react-native-app

Jest - https://jestjs.io/

Shadow CLJS - https://shadow-cljs.github.io/docs/UsersGuide.html

Most of the configuration is the same except for a few detais which should be in the files.
- Jest config in jest.config.js
- shadow-cljs for compiler configuration

To run this app you can run
`yarn watch-app`
and in another terminal
`yarn ios` (or `yarn android`)

There's not much to see, it just renders a text component that say "hello world"

To see the tests run,
`yarn watch-test`
and then in another terminal
`yarn jest`

There is only one test at the moment which is in: "src/tests/app_spec.cljs"
and is an extremely basic case where it checks that the text "hello world" is rendered.


