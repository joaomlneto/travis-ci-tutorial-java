[![Build Status](https://app.travis-ci.com/joaomlneto/travis-ci-tutorial-java.svg?branch=master)](https://app.travis-ci.com/joaomlneto/travis-ci-tutorial-java)
[![Code Coverage](https://codecov.io/github/joaomlneto/travis-ci-tutorial-java/coverage.svg)](https://codecov.io/gh/joaomlneto/travis-ci-tutorial-java)

# travis-ci-tutorial-java
Just to learn how to use travis-ci in a java project!

This is a working minimal example of how to use Travis CI (and Codecov) with Java on GitHub.

- It uses the [JUnit](https://junit.org) testing framework

[Click here for the example using GitHub Actions instead of Travis CI](https://github.com/joaomlneto/github-ci-tutorial-java)

# How To Start

1. [Fork](https://github.com/joaomlneto/travis-ci-tutorial-java/fork) this Repository
2. Go to [Travis CI](http://travis-ci.com) and enable the repository
3. Fix the `README.md` badges (replacing in the URL `joaomlneto` with `your-github-username`) and push the changes. This should trigger a build in Travis CI!

## Optional: Code Coverage with CodeCov

This repository also integrates with Codecov to generate reports.

What's done for you:
- The [JaCoCo](https://www.jacoco.org) plugin is included in `pom.xml`
- On `.travis.yml`, `after_success` target executes the Codecov script.

If you want to use it:
- Go to the Codecov website and create an account and setup permissions.
- Add your repository (you can go there directly by going to https://codecov.io/gh/your-github-username/travis-ci-tutorial-java)
- Fix the `README.md` badge.

If you don't want it:
- Remove the [JaCoCo](https://www.jacoco.org) plugin from the `pom.xml`.
- Remove the `after_success` target in `.travis.yml`
- Remove the badge from `README.md`

# Contributing

Spotted a mistake? Questions? Suggestions?  
[Open an Issue](https://github.com/joaomlneto/travis-ci-tutorial-java/issues/new)!
