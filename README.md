# lumen-plat-policy-gate

`lumen-plat-policy-gate` keeps a focused Java implementation around platform engineering. The project goal is to package a Java local lab for policy analysis with seeded input scenarios, deterministic summary checks, and documented operating limits.

## Project Rationale

I want this repository to be useful as a quick reading exercise: fixtures first, implementation second, verifier last.

## Lumen Plat Policy Gate Review Notes

`recovery` and `stress` are the cases worth reading first. They show the optimistic and cautious ends of the fixture.

## Feature Set

- `fixtures/domain_review.csv` adds cases for rollout width and quota pressure.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/lumen-plat-policy-walkthrough.md` walks through the case spread.
- The Java code includes a review path for `secret scope` and `quota pressure`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Architecture

The core code exposes a scoring path and the added review layer uses `signal`, `slack`, `drag`, and `confidence`. The domain terms are `rollout width`, `quota pressure`, `route drift`, and `secret scope`.

The Java implementation avoids hidden state so fixture changes are easy to reason about.

## Usage

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Test Command

That command is also the regression path. It verifies the domain cases and catches mismatches between the CSV, metadata, and code.

## Next Improvements

No external service is required. A deeper version would add more negative cases and a clearer boundary around invalid input.
