import { neonCursor } from 'https://unpkg.com/threejs-toys@0.0.8/build/threejs-toys.module.cdn.min.js';

neonCursor({
    el: document.body,
    shaderPoints: 16,
    curvePoints: 70,
    curveLerp: 0.5,
    radius1: 5,
    radius2: 30,
    velocityTreshold: 10
});
