# Lumen Plat Policy Gate Walkthrough

I use this file as a small checklist before changing the Java implementation.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | rollout width | 171 | ship |
| stress | quota pressure | 128 | watch |
| edge | route drift | 162 | ship |
| recovery | secret scope | 219 | ship |
| stale | rollout width | 179 | ship |

Start with `recovery` and `stress`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

The next useful expansion would be a malformed fixture around quota pressure and secret scope.
