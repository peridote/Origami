uniform mat4 worldMat, viewMat, projMat;

attribute vec3 position;
attribute  vec3 normal;
attribute  vec2 texCoord;

varying vec3 v_normal;
varying vec2 v_texCoord;

void main() {
    gl_Position = projMat * viewMat * worldMat * vec4(position, 1.0);
    v_normal = normal;
    v_texCoord = texCoord;
}

precision mediump float;

varying vec3 v_normal;

void main() {
	gl_FragColor = vec4(0.5 * normalize(v_normal) + vec3(0.5), 1.0);
}
